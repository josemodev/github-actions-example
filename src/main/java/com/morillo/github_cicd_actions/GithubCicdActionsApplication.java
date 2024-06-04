package com.morillo.github_cicd_actions;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

@SpringBootApplication
@RestController
public class GithubCicdActionsApplication {

	@GetMapping("/welcome")
	public String welcome(){
		return "Welcome To CI CD with Github Actions.";
	}

	public static void main(String[] args) {
		SpringApplication.run(GithubCicdActionsApplication.class, args);
	}


	// echo "# github-actions-example" >> README.md
	// git init
	// git add README.md
	// git commit -m "first commit"
	// git branch -M main
	// git remote add origin https://github.com/josemodev/github-actions-example.git
	// git push -u origin main

	// git add src
	// git add pom.xml
	// git commit -m "Primer Commit"

}
