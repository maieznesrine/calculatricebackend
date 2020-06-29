import { Component} from '@angular/core';

@Component({
  selector: 'app-calculatrice',
  templateUrl: './calculatrice.component.html',
  styleUrls: ['./calculatrice.component.css']
})
export class CalculatriceComponent  {

  public num1:number;
  public num2:number;
  public result:number;
  public result2:String;
  public o:number;

  addition() {
    this.result = this.num1 + this.num2;
    this.o=1;
  }
  subtract() {
    this.result = this.num1 - this.num2;
    this.o=1;
  }
  multiply() {
    this.result = this.num1 * this.num2;
    this.o=1;
  }
  divide() {
    if (this.num2==0){
      this.o=2;
    }else {
      this.result = (this.num1) / (this.num2);
      this.o=1;
    }

  }
}
