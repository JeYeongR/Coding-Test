function solution(s) {
    const hash = {};
    
    return [...s].map((val, idx) => {
        const result = hash[val] !== undefined ? idx - hash[val] : -1
        hash[val] = idx;
        return result;
    });
}