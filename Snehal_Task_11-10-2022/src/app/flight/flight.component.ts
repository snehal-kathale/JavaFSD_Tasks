import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-flight',
  templateUrl: './flight.component.html',
  styleUrls: ['./flight.component.css']
})
export class FlightComponent implements OnInit {

  Flight:String="Pune-Mumbai"
  Timehr:number=1;
  DistKm:number=130;

  constructor() { }

  ngOnInit(): void {
  }

}
