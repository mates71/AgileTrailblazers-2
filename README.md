# agileTrailblazers

Project Name: AgileTrailblazers

After I create my maven project I put the dependencies in POM.XML file that I got  from devOps team.

Dependencies I used in this project: 
      
      artifactId>cucumber-java</artifactId>
			<version>1.2.5</version>
      
      <artifactId>cucumber-junit</artifactId>
			<version>1.2.5</version>
      
      <artifactId>selenium-java</artifactId>
			<version>3.10.0</version>
      
      <artifactId>maven-compiler-plugin</artifactId>
			<version>3.3</version>
        
      <artifactId>maven-surefire-plugin</artifactId>
			<version>2.19.1</version>
        
        

I created under the “src/test/java” package separate packages for stepDefination, runnerClas and repository of homePage

I created under the “src/test/resources” package separate folders for  drivers, feature file

I created feature file for login feature. Then I added “@Smoke” tag top of the feature file

Then I created cukesRunner class. In the cukesRunner class I have stepDefination`s path and feature file`s path.And also in runnerClass I put the “@Smoke” tag.Which is I have same tag in my feature file.

When I run the cukesRunner class it gives me unimplemented steps.I copy those steps from console and paste in my stepDefination class for login feature.Then I implement the codes for each steps.

At the same time I create a separate class for login page locators to store all the locators.

After all these ready I run the runner class with dryRun=false

Musa Ates
