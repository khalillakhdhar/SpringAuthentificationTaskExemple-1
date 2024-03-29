package com.demo.web;

import com.demo.entity.AppUser;
import com.demo.service.AccountServiceImplement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserController {

    private final AccountServiceImplement accountService;

    @Autowired
    public UserController(AccountServiceImplement accountService) {
        this.accountService = accountService;
    }

    // Endpoint pour ajouter un utilisateur
    @PostMapping("/add")
    public AppUser addUser(@RequestBody AppUser user) {
        return accountService.saveUser(user);
    }

    // Endpoint pour lire la liste de tous les utilisateurs
    @GetMapping("/list")
    public List<AppUser> getAllUsers() {
        return accountService.getAllUsers();
    }

    // Endpoint pour ajouter un rôle à un utilisateur
    @PostMapping("/add-role")
    public void addRoleToUser(@RequestParam String username, @RequestParam String roleName) {
        accountService.addRoleToUser(username, roleName);
    }
}