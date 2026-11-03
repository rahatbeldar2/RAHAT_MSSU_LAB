import { Component } from '@angular/core';
import { UserProfile } from './user-profile/user-profile';

@Component({ 
  selector: 'app-root', 
  standalone: true,
  imports: [UserProfile],
  templateUrl: './app.html', 
  styleUrl: './app.css'
})
export class App {
  // User information 
  userName = 'Rahat Jamal Rahimkha Beldar';
  userEmail = 'rahat.beldar@example.com'; 
  userAge = 20;
  userCourse = 'B.Tech Computer Technology';
}