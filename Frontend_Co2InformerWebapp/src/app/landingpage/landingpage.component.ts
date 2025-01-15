import { Component } from '@angular/core';
import axios from 'axios'; // Import Axios
import { FormsModule } from '@angular/forms'; // Import FormsModule
import { CommonModule } from '@angular/common'; // Import CommonModule to use ngIf

@Component({
  selector: 'app-landingpage',
  templateUrl: './landingpage.component.html',
  styles: [``],
  imports: [CommonModule, FormsModule]
})
export class LandingpageComponent {
  country: string = ''; // Variable for the country input
  year: number | null = null; // Variable for the year input
  emissionData: EmissionData | null = null; // Use the interface here

  // Method to make the GET request using Axios
  fetchEmissions() {
    const url = `http://localhost:8081/emissions/country/${this.country}/year/${this.year}`;

    axios.get<EmissionData>(url)  // Specify the expected response type here
      .then((response) => {
        console.log("Raw response data:", response.data); // Log the raw response

        if (response.data) {
          this.emissionData = response.data; // Store the typed response data
          console.log("Stored response data:", this.emissionData); // Log the stored data
        } else {
          console.error("Response data is empty or invalid");
        }
      })
      .catch((error) => {
        console.error('Error fetching emissions data:', error);
      });
  }
}

// Updated EmissionData interface
export interface EmissionData {
  cement: string;
  coal: string;
  flaring: string;
  gas: string;
  oil: string;
  other: string;
  perCapita: string;
  total: string;
  year: string;
}
