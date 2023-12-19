function solution(n) {
    let condition = n.toString(2).replaceAll("0", "").length;
    while (true) {
        n++;
        if (n.toString(2).replaceAll("0", "").length === condition) return n;
    }
}