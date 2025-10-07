var TimeLimitedCache = function() {
    this.map=new Map();
};

/** 
 * @param {number} key
 * @param {number} value
 * @param {number} duration time until expiration in ms
 * @return {boolean} if un-expired key already existed
 */
TimeLimitedCache.prototype.set = function(key, value, duration) {
    
    let ae=this.map.get(key);
    if(ae){
        clearTimeout(ae.id);
    }

   const id=setTimeout(()=>{
      this.map.delete(key);
   },duration)

    this.map.set(key,{value,id})
    return Boolean(ae);
};

/** 
 * @param {number} key
 * @return {number} value associated with key
 */
TimeLimitedCache.prototype.get = function(key) {
    let v=this.map.get(key);
    return v==null?-1:v.value;
};

/** 
 * @return {number} count of non-expired keys
 */
TimeLimitedCache.prototype.count = function() {
    return this.map.size;
};

/**
 * const timeLimitedCache = new TimeLimitedCache()
 * timeLimitedCache.set(1, 42, 1000); // false
 * timeLimitedCache.get(1) // 42
 * timeLimitedCache.count() // 1
 */