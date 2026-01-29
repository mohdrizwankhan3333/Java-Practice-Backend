package org.example.repository;

import org.example.db.DatabaseConnection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.util.List;

@Repository
public class UserRepository {
    private final DatabaseConnection db;

    @Autowired
    public UserRepository(DatabaseConnection db) {
        this.db = db;
    }
    public List<String> getUsers(){
        return db.getUsers();
    }
    public void save(String username){
        db.addUser(username);
    }

}
