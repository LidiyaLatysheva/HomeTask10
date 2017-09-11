# Author : Lidiya Latysheva
Feature: MailRu

 Scenario: This is a sample Scenario for Mail Ru Test

 @MailRu
 Scenario Outline: MailRu send email
  Given Goto MailRu HomePage "<MailRuURL>"
  When Login
  Then Inbox page is opened
  When Click Compose button
  And Enter email information
  And Click Send button
  Then Email is sent
  When Log out from the Inbox
  Then Home page is opened


  Examples:
|MailRuURL			|
|https://mail.ru/|
      
  

      