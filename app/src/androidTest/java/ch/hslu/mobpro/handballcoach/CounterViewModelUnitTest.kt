package ch.hslu.mobpro.handballcoach

import ch.hslu.mobpro.handballcoach.room.CounterViewModel
import org.junit.Test
import org.junit.Assert.*

class CounterViewModelUnitTest {

    @Test
    fun incCounterTest() {

        val incCounterViewModel = CounterViewModel()

        //Set every Counter to 1 and test it if there are 1

        //Counter Attack +1
        incCounterViewModel.incCounterAttackBackMid()
        incCounterViewModel.incCounterAttackBackLeft()
        incCounterViewModel.incCounterAttackBackRight()
        incCounterViewModel.incCounterAttackFrontLeft()
        incCounterViewModel.incCounterAttackFrontMid()
        incCounterViewModel.incCounterAttackFrontRight()

        //Test Attack +1
        assertEquals(1, incCounterViewModel.getCounterAttackBackMid())
        assertEquals(1, incCounterViewModel.getCounterAttackBackLeft())
        assertEquals(1, incCounterViewModel.getCounterAttackBackRight())
        assertEquals(1, incCounterViewModel.getCounterAttackFrontLeft())
        assertEquals(1, incCounterViewModel.getCounterAttackFrontMid())
        assertEquals(1, incCounterViewModel.getCounterAttackFrontRight())

        //Counter Defense +1
        incCounterViewModel.incCounterDefenseBackLeft()
        incCounterViewModel.incCounterDefenseBackMid()
        incCounterViewModel.incCounterDefenseBackRight()
        incCounterViewModel.incCounterDefenseFrontLeft()
        incCounterViewModel.incCounterDefenseFrontMid()
        incCounterViewModel.incCounterDefenseFrontRight()

        //Test Defense +1
        assertEquals(1, incCounterViewModel.getCounterDefenseBackLeft())
        assertEquals(1, incCounterViewModel.getCounterDefenseBackMid())
        assertEquals(1, incCounterViewModel.getCounterDefenseBackRight())
        assertEquals(1, incCounterViewModel.getCounterDefenseFrontLeft())
        assertEquals(1, incCounterViewModel.getCounterDefenseFrontMid())
        assertEquals(1, incCounterViewModel.getCounterDefenseFrontRight())


        //Counter Technical +1
        incCounterViewModel.incCounterTechnicalCatch()
        incCounterViewModel.incCounterTechnicalStep()
        incCounterViewModel.incCounterTechnicalDouble()

        //Test Technical +1
        assertEquals(1, incCounterViewModel.getCounterTechnicalCatch())
        assertEquals(1, incCounterViewModel.getCounterTechnicalStep())
        assertEquals(1, incCounterViewModel.getCounterTechnicalDouble())
    }

    @Test
    fun resetAllCounterTest(){

        val resetCounterViewModel = CounterViewModel()

        //Counter Attack +1
        resetCounterViewModel.incCounterAttackBackMid()
        resetCounterViewModel.incCounterAttackBackLeft()
        resetCounterViewModel.incCounterAttackBackRight()
        resetCounterViewModel.incCounterAttackFrontLeft()
        resetCounterViewModel.incCounterAttackFrontMid()
        resetCounterViewModel.incCounterAttackFrontRight()

        //Counter Defense +1
        resetCounterViewModel.incCounterDefenseBackLeft()
        resetCounterViewModel.incCounterDefenseBackMid()
        resetCounterViewModel.incCounterDefenseBackRight()
        resetCounterViewModel.incCounterDefenseFrontLeft()
        resetCounterViewModel.incCounterDefenseBackMid()
        resetCounterViewModel.incCounterDefenseFrontRight()

        //Counter Technical +1
        resetCounterViewModel.incCounterTechnicalCatch()
        resetCounterViewModel.incCounterTechnicalStep()
        resetCounterViewModel.incCounterTechnicalDouble()

        //reset All Counter back to 0
        resetCounterViewModel.resetAllCounters()

        //test if all Counter are 0
        assertEquals(0, resetCounterViewModel.getCounterAttackBackMid())
        assertEquals(0, resetCounterViewModel.getCounterAttackBackLeft())
        assertEquals(0, resetCounterViewModel.getCounterAttackBackRight())
        assertEquals(0, resetCounterViewModel.getCounterAttackFrontLeft())
        assertEquals(0, resetCounterViewModel.getCounterAttackFrontMid())
        assertEquals(0, resetCounterViewModel.getCounterAttackFrontRight())

        assertEquals(0, resetCounterViewModel.getCounterDefenseBackLeft())
        assertEquals(0, resetCounterViewModel.getCounterDefenseBackMid())
        assertEquals(0, resetCounterViewModel.getCounterDefenseBackRight())
        assertEquals(0, resetCounterViewModel.getCounterDefenseFrontLeft())
        assertEquals(0, resetCounterViewModel.getCounterDefenseFrontMid())
        assertEquals(0, resetCounterViewModel.getCounterDefenseFrontRight())

        assertEquals(0, resetCounterViewModel.getCounterTechnicalCatch())
        assertEquals(0, resetCounterViewModel.getCounterTechnicalStep())
        assertEquals(0, resetCounterViewModel.getCounterTechnicalDouble())
    }
}
