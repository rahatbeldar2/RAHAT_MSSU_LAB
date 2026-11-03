import { Component, Output, EventEmitter } from '@angular/core';

@Component({
  selector: 'app-user-profile',
  standalone: true,
  imports: [],
  templateUrl: './user-profile.html',
  styleUrl: './user-profile.css'
})
export class UserProfileComponent {
  // Define the Output event emitter
  @Output() updateProfile = new EventEmitter<string>();

  // Function called when button is clicked
  onUpdate(): void {
    // Emitting the new name to the parent
    this.updateProfile.emit('Rahat Beldar Jamal Rahimkha Beldar'); 
  }
}