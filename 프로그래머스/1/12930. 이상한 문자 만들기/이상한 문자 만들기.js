function solution(s) {
    return s.split(" ").map(str => {
        const strArr = str.split("");
        for(let i = 0; i < strArr.length; i++) {
            strArr[i] = i%2==0 ? strArr[i].toUpperCase() : strArr[i].toLowerCase();
        }
        return strArr.join("");
    }).join(" ");;
}