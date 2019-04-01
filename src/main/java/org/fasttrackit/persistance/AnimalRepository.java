package org.fasttrackit.persistance;

import org.fasttrackit.Game;
import org.fasttrackit.domain.Animal;
import org.fasttrackit.service.AnimalService;

import java.io.IOException;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class AnimalRepository {


    public void createAnimal(Animal animal) throws SQLException, IOException, ClassNotFoundException {
        try (Connection connection = DatabaseConfiguration.getConnection()) {

            String insertSql = "INSERT INTO animal (`name`, hunger_level, hapiness_level, fav_activity, fav_food) VALUES (?,?,?,?,?)" +
                    "ON DUPLICATE KEY UPDATE `name` = VALUES (`name`), hunger_level = VALUES (hunger_level), hapiness_level = VALUES (hapiness_level), fav_activity = VALUES (fav_activity), fav_food = VALUES (fav_food)";

            PreparedStatement preparedStatement = connection.prepareStatement(insertSql);
            preparedStatement.setString(1, animal.getName());
            preparedStatement.setInt(2, animal.getHungerLevel());
            preparedStatement.setInt(3, animal.getHappinessLevel());
            preparedStatement.setString(4, animal.getFavActivity());
            preparedStatement.setString(5, animal.getFavFood());
            preparedStatement.executeUpdate();

        }
    }

    public void updateAnimalHungerHapiness(Animal animal) throws Exception {
        try (Connection connection = DatabaseConfiguration.getConnection()) {
            String insertSql = "UPDATE animal SET hunger_level = ?, hapiness_level = ? WHERE `name` = ?";

            PreparedStatement preparedStatement = connection.prepareStatement(insertSql);
            preparedStatement.setInt(1, animal.getHungerLevel());
            preparedStatement.setInt(2, animal.getHappinessLevel());
            preparedStatement.setString(3, animal.getName());
            preparedStatement.executeUpdate();
        }
    }


    public void selectAnimal(Animal animal) throws SQLException, IOException, ClassNotFoundException {
        try (Connection connection = DatabaseConfiguration.getConnection()) {

            Game game = new Game();

            String query = "SELECT ID, `name`, HUNGER_LEVEL, HAPINESS_LEVEL, FAV_ACTIVITY, FAV_FOOD FROM animal WHERE `name` = ?";
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setString(1, animal.getName());
            ResultSet resultSet = statement.executeQuery();

            if (resultSet.next()) {

                animal.setId(resultSet.getInt("id"));
                animal.setName(resultSet.getString("name"));
                animal.setHungerLevel(resultSet.getInt("hunger_level"));
                animal.setHappinessLevel(resultSet.getInt("hapiness_level"));
                animal.setFavFood(resultSet.getString("fav_food"));
                animal.setFavActivity(resultSet.getString("fav_activity"));

            } else {
                game.initAnimal();
            }
        }
    }
}