// function emp(name,age,salary){
//     this.name=name;
//     this.age=age;
//     this.salary=salary;
// }

// emp.prototype={
    
//     getDetails:function()
// {
//    console.log('inside the getdetails');
//    console.log("name"+this.name+"age"+this.age+"salary"+this.salary);
// }
    
// }

// By using Classes

export class Car{

    // name;
    // model;
    // prize;

    constructor(name,model,prize){
        this.name=name;
        this.model=model;
        this.prize=prize;
    }

    getCarDetails()
    {
        console.log('name '+this.name +' model '+this.model+" prize "+this.prize);

    }
} 

class Hundai extends Car{
    constructor(name,model,price,type){

        super(name,model,price)
        this.type=type;
    }
}

class maruti extends Hundai{
    constructor(name,model,price,type){

        super(name,model,price)
        this.type=type;
    }
}

var car=new Hundai('Hundai','i20',200000,'sedan');
car.getCarDetails();
var car=new maruti('Maruti','800',200000,'sedan');
car.getCarDetails();






























