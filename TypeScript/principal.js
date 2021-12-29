"use strict";
var __extends = (this && this.__extends) || (function () {
    var extendStatics = function (d, b) {
        extendStatics = Object.setPrototypeOf ||
            ({ __proto__: [] } instanceof Array && function (d, b) { d.__proto__ = b; }) ||
            function (d, b) { for (var p in b) if (b.hasOwnProperty(p)) d[p] = b[p]; };
        return extendStatics(d, b);
    };
    return function (d, b) {
        extendStatics(d, b);
        function __() { this.constructor = d; }
        d.prototype = b === null ? Object.create(b) : (__.prototype = b.prototype, new __());
    };
})();
exports.__esModule = true;
var students_1 = require("./students");
var Principal = /** @class */ (function (_super) {
    __extends(Principal, _super);
    function Principal(id, name, marks) {
        return _super.call(this, id, name, marks) || this;
    }
    return Principal;
}(students_1.Student));
var pp = new Principal(1, 'sanju', 23);
console.log(pp.name);
