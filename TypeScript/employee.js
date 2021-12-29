var v = {
    id: 1,
    name: "Hanumanth",
    city: "chittor",
    pincode: 517569,
    display: function () {
        throw new Error("Function not implemented.");
    }
};
console.log('json implementation--------------');
console.log("name is " + v.name + " and city is " + v.city);
var Manager = /** @class */ (function () {
    function Manager(id, name, city, pincode) {
        this.id = id;
        this.name = name;
        this.city = city;
        this.pincode = pincode;
    }
    Manager.prototype.display = function () {
        console.log("name is " + this.name + " and i am  in " + this.city);
    };
    return Manager;
}());
console.log('object implementation--------');
var employee = new Manager(1, "Hanumanth", 'chittoor', 222222);
employee.display();
