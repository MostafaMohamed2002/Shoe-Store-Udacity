# The Shoe Store

The Contains These Screens:
1. Login screen: Email and password fields and labels plus create and login buttons
2. Welcome onboarding screen
3. Instructions onboarding screen
4. Shoe Listing screen
5. Shoe Detail screen for adding a new shoe


<details>
  <summary>Steps I Followed To Creat This Project</summary>
  
  ## Getting Started

     Open the starter project in the latest stable version of Android Studio.
     Open the starter project in Android Studio


  1. Open the starter project in Android Studio

  2. Add the navigation libraries to the app build.gradle file

  3. Add the safe-arg plugin to the main and app build.gradle file

  4. Create a new navigation xml file

  5. Create a new Login destination.

      * Include email and password labels 

      - Include email and password fields
      - Create buttons for creating a new login and logging in with an existing account
      - Clicking either button should navigate to the Welcome Screen.

  6. Create a new Welcome screen destination that includes:

      * A new layout
      * At least 2 textviews
      * A navigation button with actions to navigate to the instructions screen

  7. Create a new Instruction destination that includes:

      * A new layout
      * At least 2 textviews
      * A navigation button with actions to navigate to the shoe list screen

  8. Create a class that extends ViewModel

      *  Use a LiveData field that returns the list of shoes

  9. Create a new Shoe List destination that includes:

      * A new layout
      * A ScrollView
      * A LinearLayout for Shoe Items
      * A FloatingActionButton with an action to navigate to the shoe detail screen

  10. In MainActivity, setup the nav controller with the toolbar and an AppBarConfiguration.

  11. Create a new Shoe Detail destination that includes:

      * A new layout
      * A TextView label and EditView for the
        * Shoe Name
        * Company
        * Shoe Size
        * Description
      * A Cancel button with an action to navigate back to the shoe list screen
      * A Save button with an action to navigate back to the shoe list screen and add a new Shoe to the Shoe View Model

  12. Make sure you can’t go back to onboarding screens

  13. In the Shoe List screen:

      * Use an Activity level ViewModel to hold a list of Shoes (use by activityViewModels)
      * Observe the shoes variable from the ViewModel
      * Use DataBindingUtil to inflate the shoe_list layout
      * Add a new layout item into the scrollview for each shoe.
      
</details>
<br/>

## Udacity Reviews For My Project
[Udacity Review first.pdf](https://github.com/MostafaMohamed2002/ShoeStore/files/9335146/Udacity.Review.first.pdf)
![image](https://user-images.githubusercontent.com/41519636/185876740-21cb7c1f-d663-49cc-b481-c277e513cf12.png)

[Udacity Review second.pdf](https://github.com/MostafaMohamed2002/ShoeStore/files/9335149/Udacity.Review.second.pdf)
![image](https://user-images.githubusercontent.com/41519636/185877425-20428c83-7efe-4c23-9829-f7690bd760f2.png)

## App Preview

[![Android-Emulator---ShoeAppFirstSubmission-2022-08-15-05-56-14-1.gif](https://s4.gifyu.com/images/Android-Emulator---ShoeAppFirstSubmission-2022-08-15-05-56-14-1.gif)](https://gifyu.com/image/ST8pf)



