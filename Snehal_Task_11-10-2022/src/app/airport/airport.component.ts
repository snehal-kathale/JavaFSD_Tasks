import { Component, OnInit } from '@angular/core';
import {HospitalityService} from './hospitality.service'
@Component({
  selector: 'app-airport',
  templateUrl: './airport.component.html',
  styleUrls: ['./airport.component.css'],
  providers:[HospitalityService]
})
export class AirportComponent implements OnInit {
  Name:string="Pune international Airport"
  Location:string="Pune,Viamannager"

  airport:string
  
  constructor(private hosptitabilityservice:HospitalityService ){
    this.airport=this.hosptitabilityservice.datails();
  }

  ngOnInit(): void {
  }

}
