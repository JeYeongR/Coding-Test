function solution(s) {
    const arr = s.split('');
    let stack = [];
    for (let i = 0; i < arr.length; i++){
        const val = arr[i];
        if( val === stack[stack.length - 1]) {
            stack.pop();
        } else {
            stack.push(val);
        }
    }    
    return stack.length === 0 ? 1 : 0 ;
}