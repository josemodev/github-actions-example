package com.morillo.github_cicd_actions;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

@SpringBootApplication
@RestController
public class GithubCicdActionsApplication {

	@GetMapping("/welcome")
	public String welcome(){
		return "Welcome To CI CD with Github Actions. Despues de esto, conocer Jenkins";
	}

	public static void main(String[] args) {
		SpringApplication.run(GithubCicdActionsApplication.class, args);
	}


	// echo "# github-actions-example" >> README.md
	// git init
	// git add README.md
	// git commit -m "first commit"
	// git branch -M main																CREAR PARA TRABAJAR EN LA RAMA DESEADA, PARA LUEGO SUBIRLA A REMOTO. SE DE CREAR EN REMOTO A TRAVES DE CODIGO O EN Github.
	// git remote add origin https://github.com/josemodev/github-actions-example.git
	// git push -u origin main															SIEMPRE SE DEBE ESPECIFICAR EN REMOTO CADA RAMA DE ESTA MANERA, AL FINAL IRA EL NOMBRE DE LA RAMA

	// git add src																		NO SE DEBE GUARDAR TODOS LOS ARCHIVOS SOLO LOS ESENCIALES. NO GUARAR NPM.
	// git add pom.xml
	// git commit -m "Primer Commit"

	// git pull origin master															git pull REMOTE-NAME BRANCH-NAME  Reemplaza REMOTE-NAME con el nombre del repositorio remoto (por lo general, “origin”) y BRANCH-NAME con el nombre de la rama que deseas actualizar.
}
