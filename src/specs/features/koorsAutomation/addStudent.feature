@addStudent
Feature: director add new student with valid and invalid credentials
         As a director I want to add a new student 

Background: Successful director Login

Given I am on the director login page
When I enter the email "qa+uptotestg2@koors.io"
And I enter the password "123456789SF"
Then I click on the login buttonssss
When I am on Activity page
And I click on the student button
And I click on add a student button
#Given I click on inviter button  
       
@validAddStudent
Scenario Outline:: Successful student add

Given I fill last name student "<Name>"
When I fill first name student "<Firstname>"
And I fill e-mail address student "<Email>"
And I click on the inviter button 
Then I verify am on student page
Examples:
| Name       | Firstname| Email                       |                                     
| BOUDJELLAL | sabine   | sabine.boudjellal1@gmail.com|            

@concilAddStudent
Scenario Outline: Cancel student add

Given I fill last name student "<Name>"
When I fill first name student "<Firstname>"
And I fill e-mail address student "<Email>"
And I click on cancel button 
Then I verify I am on the student page
Examples:
| Name       | Firstname| Email                       |                                     
| BOUDJELLAL | sabine   | sabine.boudjellal1@gmail.com|
    
@deleteAddStudent
Scenario Outline: Delete student add

Given I enter last name student "<Name>"
When I enter first name student "<Firstname>"
And I enter e-mail address student "<Email>"
And I click on delete button 
Then I verify that I am on student page
Examples:
| Name       | Firstname| Email                       |                                     
| BOUDJELLAL | sabine   | sabine.boudjellal1@gmail.com|
    
@InvalidddStudent
Scenario Outline: Invalid student add

Given I enter last name student "<Name>"
When I enter first name student "<Firstname>"
And I enter e-mail address student "<Email>"
And I click on the invite buttons 
And I verify text "<ErrorMessage>" on login koors page 
Then I verify that I am on the student page
Examples:
| Name        | Firstname   | Email                       |  ErrorMessage           | 
#| BOUDJE@LLAL | sabine      | sabine.boudjellal1@gmail.com| Le nom est invalide     |                        
#| BOUDJELLAL  | sabi@ne     | sabine.boudjellal1@gmail.com| le prenom est invalide  |
| BOUDJELLAL  | sabine      | sabine.boudjellal1.gmail.com| L'email est invalide    |

#| {BACKSPACE} | sabi@ne     | sabine.boudjellal1@gmail.com|                         |
#| BOUDJELLAL  |{BACKSPACE}  | sabine.boudjellal1gmail.com |                         |
#| {BACKSPACE} |{BACKSPACE}  | sabine.boudjellal1@gmail.com|                         |

@ValidAddStudentsFile
Scenario Outline: add students file

Given I click on importer une liste button
When I verify the text "Importer la liste des étudiants" on ajouter un etudiant page 
And I click on select file button and choose file
And I click on checkbox consent 
And I click on continue button
And I verify number of student "2 importations réussies"
And I click on send invitations button 
And I click on confirm and send button 
Then I verify that I am on student page

@InValidAddStudentsFile
Scenario Outline: add students file

Given I click on importer une liste button to cancil
When I verify the import list text "Importer la liste des étudiants" on ajouter un etudiant page 
And I click on continue button to cancil
And I verify the file text "Vous devez ajouter votre fichier Excel." to cancil 
And I verify the consent text "J'ai le consentement des utilisateurs enregistrés dans ce fichier"
And I click on cancil button to cancil student list
Then I verify that I am on student page to cancil
 