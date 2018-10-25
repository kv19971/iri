from iota import Iota, ProposedTransaction, ProposedBundle, Address, Tag, TryteString

# Generate a random seed.
api = Iota('http://localhost:14265')

# Specify seed.
api = Iota('http://localhost:14265', 'SEED9GOES9HERE')


output = ProposedTransaction(
    # receiving address of the transfer
    address = Address(
        b'ADDRESS9GOES9HERE99999999999999999999999999999999999TESTVALUE9DONTUSEINPRODUCTION'
        ),

    # Amount of Iota you want to send
    value = 0,

    # Optional Tag (27-trytes)
    tag = Tag(TryteString.from_string('10 20'))

    # Message (2187-trytes)
    # message = TryteString.from_string('10 20 30')
    )

bundle = ProposedBundle()

bundle.add_transaction(output)

prepared_bundle = api.prepare_transfer(bundle)
