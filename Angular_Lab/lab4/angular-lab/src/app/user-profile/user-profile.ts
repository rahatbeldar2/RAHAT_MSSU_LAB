import { Component, Input } from '@angular/core';

@Component({
  selector: 'app-user-profile', 
  standalone: true,
  imports: [],
  templateUrl: './user-profile.html', 
  styleUrl: './user-profile.css'
})
export class UserProfile {
  // Modern Angular (v16+): Use { required: true } for mandatory data
  @Input({ required: true }) name: string = '';
  @Input({ required: true }) email: string = ''; 
  @Input() age: number = 0; 
  @Input() course: string = '';
}