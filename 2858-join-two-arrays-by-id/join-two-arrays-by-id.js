/**
 * @param {Array} arr1
 * @param {Array} arr2
 * @return {Array}
 */
var join = function(arr1, arr2) {
    const map = new Map();

    // Add all elements from arr1
    for (const obj of arr1) {
        map.set(obj.id, obj);
    }

    // Merge with arr2, overriding arr1 properties when needed
    for (const obj of arr2) {
        if (map.has(obj.id)) {
            const merged = { ...map.get(obj.id), ...obj }; // merge props
            map.set(obj.id, merged);
        } else {
            map.set(obj.id, obj);
        }
    }

    // Convert map to array and sort by id
    return Array.from(map.values()).sort((a, b) => a.id - b.id);
};
