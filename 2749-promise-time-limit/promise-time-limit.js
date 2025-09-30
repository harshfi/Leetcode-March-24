/**
 * @param {Function} fn
 * @param {number} t
 * @return {Function}
 */
var timeLimit = function(fn, t) {
    
    return async function(...args) {
      
     return new Promise((resolve,reject)=>{
        
      let timerId;


      fn(...args)
      .then(rs=>{
        resolve(rs)
      })
      .catch(err=>{
        reject(err);
      })
      .finally(()=>{
        clearTimeout(timerId);
      })


      timerId=setTimeout(()=>{
        reject ('Time Limit Exceeded')
      },t)

     })

      

    }
};

