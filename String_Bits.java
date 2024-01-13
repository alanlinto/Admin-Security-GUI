public class String_Bits {
    public String stringToBits(String input) {
        StringBuilder binaryRepresentation = new StringBuilder();

        // Convert each character to its binary representation
        for (char c : input.toCharArray()) {
            // Get the bytes for each character
            byte[] bytes = Character.toString(c).getBytes();

            // Convert each byte to its binary representation
            for (byte b : bytes) {
                int value = b;
                for (int i = 7; i >= 0; i--) {
                    binaryRepresentation.append((value & (1 << i)) == 0 ? '0' : '1');
                }
            }
        }

        return binaryRepresentation.toString();
    }

    public String binaryToString(String binaryString) {
        StringBuilder result = new StringBuilder();

        // Split the binary string into 8-bit chunks
        for (int i = 0; i < binaryString.length(); i += 8) {
            String eightBits = binaryString.substring(i, Math.min(i + 8, binaryString.length()));

            // Convert 8 bits to decimal
            int decimalValue = Integer.parseInt(eightBits, 2);

            // Convert decimal to character
            result.append((char) decimalValue);
        }

        return result.toString();
    }

}