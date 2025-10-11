/**
 * @param {Object|Array} obj
 * @return {boolean}
 */
var isEmpty = function(obj) {
    const input=JSON.stringify(obj)
    // console.log(input.length,input)
    return input.length<=2?true:false;
};