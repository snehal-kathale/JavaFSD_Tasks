import { Component, OnInit } from '@angular/core';
import { NgModel } from '@angular/forms';

@Component({
  selector: 'app-payment',
  templateUrl: './payment.component.html',
  styleUrls: ['./payment.component.css']
})
export class PaymentComponent implements OnInit {

  constructor() { }
  PaymentData="Payment is done";
  dataFromCostumer:string="payment successful";

  getData(data:any){
    

    // alert ("Alert message")
      
    console.log(data);
     this.dataFromCostumer=data;
  }
  


  ngOnInit(): void {
  }

}
