import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class HospitalityService {
    
  datails():string{
      return ` Called through Service class: 
               We provide various services for your safe and comfortable journey.`
      
  }
  
  constructor() { }
}
