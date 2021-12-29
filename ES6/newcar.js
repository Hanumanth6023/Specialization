import {Car} from './Car';
class BMW extends Car{

    constructor(name,model,price,type){
        super(name,model,prize)
        this.type=type;
    }
}

var bmw=new BMW('bmw','530D',100000,'sedan');
bmw.getCarDetails();