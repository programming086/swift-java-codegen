public class RSMAContact: Codable {
    var id: String
    var name: String? = ""
    var emails: [String] = []

    func djb2hash(_ str: String) -> Int{
        let unicodeScalars = str.unicodeScalars.map { $0.value }
        return unicodeScalars.reduce(5381) {
            ($0 << 5) &+ $0 &+ Int($1)
        }
    }


    var hashValue: Int {
        var hash = djb2hash(id) ^ emails.reduce(5381) {
            ($0 << 5) &+ $0 &+ djb2hash($1)
        }
        if let name = self.name {
            hash ^= djb2hash(name)
        }
        return hash
    }
}
