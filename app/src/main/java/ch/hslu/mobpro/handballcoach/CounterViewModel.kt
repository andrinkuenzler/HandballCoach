package ch.hslu.mobpro.handballcoach

import androidx.lifecycle.ViewModel

class CounterViewModel: ViewModel() {

    // Attack Front
    private var counterAttackFrontLeft = 0
    private var counterAttackFrontMid = 0
    private var counterAttackFrontRight = 0

    // Attack Back
    private var counterAttackBackLeft = 0
    private var counterAttackBackMid = 0
    private var counterAttackBackRight = 0

    // Defense Front
    private var counterDefenseFrontLeft = 0
    private var counterDefenseFrontMid = 0
    private var counterDefenseFrontRight = 0

    // Defense Back
    private var counterDefenseBackLeft = 0
    private var counterDefenseBackMid = 0
    private var counterDefenseBackRight = 0

    // Attack Front
    fun incCounterAttackFrontLeft() {
        counterAttackFrontLeft++
    }
    fun getCounterAttackFrontLeft(): Int {
        return counterAttackFrontLeft
    }

    fun incCounterAttackFrontMid() {
        counterAttackFrontMid++
    }
    fun getCounterAttackFrontMid(): Int {
        return counterAttackFrontMid
    }

    fun incCounterAttackFrontRight() {
        counterAttackFrontRight++
    }
    fun getCounterAttackFrontRight(): Int {
        return counterAttackFrontRight
    }

    // Attack Back
    fun incCounterAttackBackLeft() {
        counterAttackBackLeft++
    }
    fun getCounterAttackBackLeft(): Int {
        return counterAttackBackLeft
    }

    fun incCounterAttackBackMid() {
        counterAttackBackMid++
    }
    fun getCounterAttackBackMid(): Int {
        return counterAttackBackMid
    }

    fun incCounterAttackBackRight() {
        counterAttackBackRight++
    }
    fun getCounterAttackBackRight(): Int {
        return counterAttackBackRight
    }

    // Defense Front
    fun incCounterDefenseFrontLeft() {
        counterDefenseFrontLeft++
    }
    fun getCounterDefenseFrontLeft(): Int {
        return counterDefenseFrontLeft
    }

    fun incCounterDefenseFrontMid() {
        counterDefenseFrontMid++
    }
    fun getCounterDefenseFrontMid(): Int {
        return counterDefenseFrontMid
    }

    fun incCounterDefenseFrontRight() {
        counterDefenseFrontRight++
    }
    fun getCounterDefenseFrontRight(): Int {
        return counterDefenseFrontRight
    }

    // Defense Back
    fun incCounterDefenseBackLeft() {
        counterDefenseBackLeft++
    }
    fun getCounterDefenseBackLeft(): Int {
        return counterDefenseBackLeft
    }

    fun incCounterDefenseBackMid() {
        counterDefenseBackMid++
    }
    fun getCounterDefenseBackMid(): Int {
        return counterDefenseBackMid
    }

    fun incCounterDefenseBackRight() {
        counterDefenseBackRight++
    }
    fun getCounterDefenseBackRight(): Int {
        return counterDefenseBackRight
    }

    fun resetAllCounters() {
        // Attack Front
        counterAttackFrontLeft = 0
        counterAttackFrontMid = 0
        counterAttackFrontRight = 0
        // Attack Back
        counterAttackBackLeft = 0
        counterAttackBackMid = 0
        counterAttackBackRight = 0
        // Defense Front
        counterDefenseFrontLeft = 0
        counterDefenseFrontMid = 0
        counterDefenseFrontRight = 0
        // Defense Back
        counterDefenseBackLeft = 0
        counterDefenseBackMid = 0
        counterDefenseBackRight = 0
    }
}