var TestTS = /** @class */ (function () {
    function TestTS() {
    }
    TestTS.prototype.helloRESTOperator = function () {
        var arr = [];
        for (var _i = 0; _i < arguments.length; _i++) {
            arr[_i] = arguments[_i];
        }
        var sum = 0;
        arr.forEach(function (x) {
            sum = sum + x;
        });
        return sum;
    };
    TestTS.prototype.testArray = function () {
        var ar = [];
        ar.push(10);
        // ar.push('heyy');
        ar.push(22);
        console.log(ar.join());
        var ar1 = [];
        ar1.push(1111);
        ar1.push(11121);
        ar1.push('hello');
        console.log(ar1.join());
        var ar2 = ['hey', 'hiii', 22, 33, 44, 44, 'helloooo'];
        console.log(ar2.join());
        var ar3 = ['java', 14];
        ar3.push('jee');
        ar3.push(999);
        ar3.push(88888);
        //ar3.push(true);
        console.log(ar3.join());
        var ar4 = ['jme'];
        //ar4.push(3);
        ar4.push('servlet');
        console.log(ar4.join());
    };
    return TestTS;
}());
var t = new TestTS();
console.log('Testing Rest operator');
console.log(t.helloRESTOperator(12, 344, 1, 2, 3, 4, 4, 44, 4, 44, 4));
console.log(t.helloRESTOperator());
console.log(t.helloRESTOperator(22, 21, 33));
t.testArray();
