function solution(phone_number) {
    const open = phone_number.slice(-4);
    const secretLength = phone_number.slice(0, -4).length;
    return "*".repeat(secretLength) + open;
}