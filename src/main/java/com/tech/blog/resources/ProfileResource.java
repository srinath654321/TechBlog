package com.tech.blog.resources;

import com.tech.blog.service.ProfileService;
import com.tech.blog.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

@RestController
@RequestMapping("/user")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class ProfileResource {

    @Autowired
    private ProfileService profileService;

    @GetMapping("/{id}")
    public User getUserInfo(@PathVariable String id) throws IOException {
        return profileService.getUser(id);
    }

    @PostMapping()
    public User saveUserInfo(@RequestBody User user) throws IOException {
        User saveUser = profileService.saveUser(user);
        return saveUser;
    }
}