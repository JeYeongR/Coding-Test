function solution(s) {
    return s.split(" ").map(str => str.split("").map((e, i) => (e = i % 2 == 0 ? e.toUpperCase() : e.toLowerCase())).join("")).join(" ");
}