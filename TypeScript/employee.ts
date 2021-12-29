interface address{
      city: string;
      pincode:number;
}

interface Employee extends address{
    id : number;
    name: String;
    display(): void;

}

var v:Employee={
    id: 1,
    name: "Hanumanth",
    city: "chittor",
    pincode: 517569,
    display: function (): void {
        throw new Error("Function not implemented.");
    }
};

console.log('json implementation--------------')
console.log(`name is ${v.name} and city is ${v.city}`)

class Manager implements Employee{

    id : number;
    name: String;
    city:string;
    pincode: number;

    constructor(id:number,name:string,city:string,pincode:number){
            this.id=id;
            this.name=name;
            this.city=city;
            this.pincode=pincode;

    }

    display(): void{
        console.log(`name is ${this.name} and i am  in ${this.city}`)
       
    }

}

console.log('object implementation--------')
var employee:Manager = new Manager (1,"Hanumanth",'chittoor',222222);
employee.display();