const mongoose = require('mongoose');

const dataSchema = mongoose.Schema({
    ts: {
        required: true,
        type: String
    },
    machine_status: {
        required: true,
        type: Number
    },

})

module.exports = Timeline = mongoose.model('timeline', dataSchema)