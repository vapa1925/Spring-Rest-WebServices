package com.pavan.springrestwebservices.controller;

import com.pavan.springrestwebservices.model.user;
import com.pavan.springrestwebservices.userDao.userrepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Optional;

@RestController
public class usercontroller {
    @Autowired
    private com.pavan.springrestwebservices.userDao.userrepository repository;

    @GetMapping("/allusers" )
    public ResponseEntity<?> getallusers() {
         ArrayList<user> users= new ArrayList<>(repository.findAll());
        return new ResponseEntity<>(users, HttpStatus.OK);
    }
    @PostMapping("/createuser")
    public ResponseEntity<?> createuser(@RequestBody user User){
       user addUser= repository.save(User);
        return new ResponseEntity<>("user created",HttpStatus.CREATED);
    }
    @GetMapping("/{id}")
    public ResponseEntity<?> getuserbyid(@PathVariable int id){
       Optional user =repository.findById(id);
        return new ResponseEntity<>(user,HttpStatus.OK);
    }
    @PostMapping("/update")
    public ResponseEntity<?> updateuser(@RequestBody user User)
    {
        boolean userexist= repository.existsById(User.getUserid());
        if(userexist){
            user adduser=new user();
            adduser.setUserid(User.getUserid());
            adduser.setName(User.getName());
              repository.saveAndFlush(adduser);
       }
        return  new ResponseEntity<>("user updated",HttpStatus.CREATED);
    }
    @DeleteMapping("delete/{id}")
    public ResponseEntity<?> deletebyid(@PathVariable int id){
        Boolean isexist=repository.existsById(id);
        if(isexist)
        {
            repository.deleteById(id);
        }
        return new ResponseEntity("deleted successfully",HttpStatus.OK);
    }


}
