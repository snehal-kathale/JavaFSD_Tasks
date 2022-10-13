import { Component, EventEmitter, Input, OnInit, Output } from '@angular/core';
import { PaymentComponent } from '../payment/payment.component';

@Component({
  selector: 'app-constumer',
  templateUrl: './constumer.component.html',
  styleUrls: ['./constumer.component.css']
})
export class ConstumerComponent implements OnInit {

  @Input() 
  data:any;

  @Input()
  costumerInput:string="";
 
  @Output()
  eventobj:EventEmitter<string> = new EventEmitter();

  CostumerData:string="Its costumerdata";

  sendData(data:any){

    this.eventobj.emit(this.CostumerData);
    console.log("data")
  }

  constructor() { }

  ngOnInit(): void {
  }

}
