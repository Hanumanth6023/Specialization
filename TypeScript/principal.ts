import {Student} from './students';
class Principal extends Student{
    constructor(id:number,name:string,marks:number){
        super(id,name,marks);
    }

}

var pp:Principal = new Principal(1,'sanju',23);
console.log(pp.name);