class Employee{

    eid:number;
    ename:string;
    salary:number;


        constructor (private city: string, eid:number, ename:string, sal:number)
        {
            this.eid= eid;
            this.ename = ename;
            this.salary = sal;
            this.city = city;


         console.log("Emp obj created...")

        }

        getEmp():void{

            console.log("Welcome to employee class")
        }

    m1(){

        console.log("m1() is called")

    }

}

var  e1 = new Employee("Pune",101, "snehal", 5000000);
e1.getEmp();
console.log(this.city)
console.log(e1)
e1.m1()