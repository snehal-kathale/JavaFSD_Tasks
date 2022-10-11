

// NORMAL FUNCTIONS
function  f1(){

    console.log("its normal function");


}

f1()

// ANONYMOUS FUNCTIONS

 var f2 = function(name){

    return "welcome "+name;

 }

 var output = f2("Snehal");
console.log(output)


// ARROW FUNCTION
var f3 = (eid,ename) => {

        console.log(eid +" "+ename);


}


f3(101,'Nitesh');

// default param

function add1(a,b=5){


    return a+b;

}

console.log(add1(3,7));


//spread or rest parameter


function   add(name,...a){   //a[]   


        console.log("spread func callled.."+name)

        return a[0] + a[1];


}

console.log(add("snehal",10,20));


function  stringDemo(){


    let  str1 = 'hello friend  \n how are you';

console.log(str1)

    //backtick  string template

    let salary = 50000;

    let str2 = `hello friends 
    how are you ,
     am not good`;

    console.log(str2);

    // string interpolation ${}  = {{}}

    let str3 = `my salary is ${salary}`;

    console.log(str3)


}


stringDemo()
