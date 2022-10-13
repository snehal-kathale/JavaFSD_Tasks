import { ApplicationRef, Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'MyApp';

  mycolor="Purple"
 Flag:boolean=true
 Ldate= new Date (2022,10,12)
 choice:string=""
 data:string=""
 names:string[]=["snehal","nitesh","himani","sumit"]

 

}






