import { Component } from '@angular/core';
import { RouterOutlet } from '@angular/router';
import { LandingpageComponent } from "./landingpage/landingpage.component";

@Component({
  selector: 'app-root',
  imports: [RouterOutlet, LandingpageComponent],
  template: `
    
    <app-landingpage/> 
    

    <router-outlet />
  `,
  styles: [],
})
export class AppComponent {
  
}
