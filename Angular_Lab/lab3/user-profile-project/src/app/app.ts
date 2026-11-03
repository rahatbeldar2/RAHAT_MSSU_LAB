import { Component } from '@angular/core';
// Import the child component so we can use it
import { UserProfileComponent } from './user-profile/user-profile'; 

@Component({
  selector: 'app-root',
  standalone: true,
  imports: [UserProfileComponent], // Add child component here
  templateUrl: './app.html',
  styleUrl: './app.css'
})
export class AppComponent {
  userName = 'Guest'; // Initial value

  // This function receives data from the child
  updateUser(name: string) {
    this.userName = name;
  }
}