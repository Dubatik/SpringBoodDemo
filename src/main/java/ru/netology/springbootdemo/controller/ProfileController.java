package ru.netology.springbootdemo.controller;

import org.springframework.web.bind.annotation.*;
import ru.netology.springbootdemo.model.SystemProfile;

@RestController
@RequestMapping("/")
public class ProfileController {
    private SystemProfile profile;

    public ProfileController(SystemProfile profile) {
        this.profile = profile;
    }

    @GetMapping("profile")
    public String getProfile() {
        return profile.getProfile();
    }
}