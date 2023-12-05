function solution(a, b) {
    return new Date(2016, a-1, b).toDateString().slice(0, 3).toUpperCase();
}