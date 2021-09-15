package com.example.circle_fork

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import kotlinx.android.synthetic.main.activity_main.*
import android.support.v7.app.AlertDialog
import android.widget.Toast

var win = 0
var loss = 0
var equal = 0

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    var total_click = 0

    fun if_circle(total_click: Int): Boolean {
        if (total_click % 2 == 1)
            return true
        return false
    }

    fun buttonClick_1(view: View) {
        total_click += 1
        if (imageView.visibility == View.VISIBLE || imageView11.visibility == View.VISIBLE) {
            return
        }
        if (if_circle(total_click)) {
            imageView.setVisibility(View.VISIBLE)
        } else {
            imageView11.setVisibility(View.VISIBLE)
        }
        check(view)
    }

    fun buttonClick_2(view: View) {
        total_click += 1
        if (imageView2.visibility == View.VISIBLE || imageView12.visibility == View.VISIBLE) {
            return
        }
        if (if_circle(total_click)) {
            imageView2.setVisibility(View.VISIBLE)
        } else {
            imageView12.setVisibility(View.VISIBLE)
        }
        check(view)
    }

    fun buttonClick_3(view: View) {
        total_click += 1
        if (imageView3.visibility == View.VISIBLE || imageView13.visibility == View.VISIBLE) {
            return
        }
        if (if_circle(total_click)) {
            imageView3.setVisibility(View.VISIBLE)
        } else {
            imageView13.setVisibility(View.VISIBLE)
        }
        check(view)
    }

    fun buttonClick_4(view: View) {
        total_click += 1
        if (imageView4.visibility == View.VISIBLE || imageView14.visibility == View.VISIBLE) {
            return
        }
        if (if_circle(total_click)) {
            imageView4.setVisibility(View.VISIBLE)
        } else {
            imageView14.setVisibility(View.VISIBLE)
        }
        check(view)
    }

    fun buttonClick_5(view: View) {
        total_click += 1
        if (imageView5.visibility == View.VISIBLE || imageView15.visibility == View.VISIBLE) {
            return
        }
        if (if_circle(total_click)) {
            imageView5.setVisibility(View.VISIBLE)
        } else {
            imageView15.setVisibility(View.VISIBLE)
        }
        check(view)
    }

    fun buttonClick_6(view: View) {
        total_click += 1
        if (imageView6.visibility == View.VISIBLE || imageView16.visibility == View.VISIBLE) {
            return
        }
        if (if_circle(total_click)) {
            imageView6.setVisibility(View.VISIBLE)
        } else {
            imageView16.setVisibility(View.VISIBLE)
        }
        check(view)
    }

    fun buttonClick_7(view: View) {
        total_click += 1
        if (imageView7.visibility == View.VISIBLE || imageView17.visibility == View.VISIBLE) {
            return
        }
        if (if_circle(total_click)) {
            imageView7.setVisibility(View.VISIBLE)
        } else {
            imageView17.setVisibility(View.VISIBLE)
        }
        check(view)
    }

    fun buttonClick_8(view: View) {
        total_click += 1
        if (imageView8.visibility == View.VISIBLE || imageView18.visibility == View.VISIBLE) {
            return
        }
        if (if_circle(total_click)) {
            imageView8.setVisibility(View.VISIBLE)
        } else {
            imageView18.setVisibility(View.VISIBLE)
        }
        check(view)
    }

    fun buttonClick_9(view: View) {
        total_click += 1
        if (imageView9.visibility == View.VISIBLE || imageView19.visibility == View.VISIBLE) {
            return
        }
        if (if_circle(total_click)) {
            imageView9.setVisibility(View.VISIBLE)
        } else {
            imageView19.setVisibility(View.VISIBLE)
        }
        check(view)
    }

    fun one_more(view: View) {
        Toast.makeText(applicationContext, "遊戲已重置^__^\n請「O」先下", Toast.LENGTH_SHORT).show()
        restart(view)
    }

    fun clear_all(view: View) {
        Toast.makeText(applicationContext, "歷史紀錄已被清除", Toast.LENGTH_SHORT).show()
        win = 0
        loss = 0
        equal = 0
    }


    fun check(view: View) {
        // circle win
        if ((imageView.visibility == View.VISIBLE && imageView2.visibility == View.VISIBLE && imageView3.visibility == View.VISIBLE) ||
            (imageView4.visibility == View.VISIBLE && imageView5.visibility == View.VISIBLE && imageView6.visibility == View.VISIBLE) ||
            (imageView7.visibility == View.VISIBLE && imageView8.visibility == View.VISIBLE && imageView9.visibility == View.VISIBLE) ||
            (imageView.visibility == View.VISIBLE && imageView4.visibility == View.VISIBLE && imageView7.visibility == View.VISIBLE) ||
            (imageView2.visibility == View.VISIBLE && imageView5.visibility == View.VISIBLE && imageView8.visibility == View.VISIBLE) ||
            (imageView3.visibility == View.VISIBLE && imageView6.visibility == View.VISIBLE && imageView9.visibility == View.VISIBLE) ||
            (imageView.visibility == View.VISIBLE && imageView5.visibility == View.VISIBLE && imageView9.visibility == View.VISIBLE) ||
            (imageView3.visibility == View.VISIBLE && imageView5.visibility == View.VISIBLE && imageView7.visibility == View.VISIBLE)
        ) {
            win += 1
            dialog_circle(view)
        } else if ((imageView11.visibility == View.VISIBLE && imageView12.visibility == View.VISIBLE && imageView13.visibility == View.VISIBLE) ||
            (imageView14.visibility == View.VISIBLE && imageView15.visibility == View.VISIBLE && imageView16.visibility == View.VISIBLE) ||
            (imageView17.visibility == View.VISIBLE && imageView18.visibility == View.VISIBLE && imageView19.visibility == View.VISIBLE) ||
            (imageView11.visibility == View.VISIBLE && imageView14.visibility == View.VISIBLE && imageView17.visibility == View.VISIBLE) ||
            (imageView12.visibility == View.VISIBLE && imageView15.visibility == View.VISIBLE && imageView18.visibility == View.VISIBLE) ||
            (imageView13.visibility == View.VISIBLE && imageView16.visibility == View.VISIBLE && imageView19.visibility == View.VISIBLE) ||
            (imageView11.visibility == View.VISIBLE && imageView15.visibility == View.VISIBLE && imageView19.visibility == View.VISIBLE) ||
            (imageView13.visibility == View.VISIBLE && imageView15.visibility == View.VISIBLE && imageView17.visibility == View.VISIBLE)
        ) {
            loss += 1
            dialog_fork(view)
        } else if ((imageView.visibility == View.VISIBLE || imageView11.visibility == View.VISIBLE) &&
            (imageView2.visibility == View.VISIBLE || imageView12.visibility == View.VISIBLE) &&
            (imageView3.visibility == View.VISIBLE || imageView13.visibility == View.VISIBLE) &&
            (imageView4.visibility == View.VISIBLE || imageView14.visibility == View.VISIBLE) &&
            (imageView5.visibility == View.VISIBLE || imageView15.visibility == View.VISIBLE) &&
            (imageView6.visibility == View.VISIBLE || imageView16.visibility == View.VISIBLE) &&
            (imageView7.visibility == View.VISIBLE || imageView17.visibility == View.VISIBLE) &&
            (imageView8.visibility == View.VISIBLE || imageView18.visibility == View.VISIBLE) &&
            (imageView9.visibility == View.VISIBLE || imageView19.visibility == View.VISIBLE)
        ) {
            equal += 1
            dialog_equal(view)
        }
    }

    fun dialog_circle(view: View) {
        var result = "恭喜「O」獲勝。\n目前「O」共獲勝${win}場,「X」共獲勝${loss}場,平手${equal}場。"
        val builder = AlertDialog.Builder(this)
        builder.setMessage(result)
            .setPositiveButton("確定",
                { dialog, id ->
                    print("確定")
                })
            .setNegativeButton("取消",
                { dialog, id ->
                    print("取消")
                })
        builder.create().show()
    }

    fun dialog_fork(view: View) {
        var result = "恭喜「X」獲勝。\n目前「O」共獲勝${win}場,「X」共獲勝${loss}場,平手${equal}場。"
        val builder = AlertDialog.Builder(this)
        builder.setMessage(result)
            .setPositiveButton("確定",
                { dialog, id ->
                    print("確定")
                })
            .setNegativeButton("取消",
                { dialog, id ->
                    print("取消")
                })
        builder.create().show()
    }

    fun dialog_equal(view: View) {
        var result = "平手。\n目前「O」共獲勝${win}場,「X」共獲勝${loss}場,平手${equal}場。"
        val builder = AlertDialog.Builder(this)
        builder.setMessage(result)
            .setPositiveButton("確定",
                { dialog, id ->
                    print("確定")
                })
            .setNegativeButton("取消",
                { dialog, id ->
                    print("取消")
                })
        builder.create().show()
    }

    fun restart(view: View) {
        val imageView_list = listOf(
            imageView,
            imageView2,
            imageView3,
            imageView4,
            imageView5,
            imageView6,
            imageView7,
            imageView8,
            imageView9,
            imageView11,
            imageView12,
            imageView13,
            imageView14,
            imageView15,
            imageView16,
            imageView17,
            imageView18,
            imageView19
        )
        for (i in 0..17) {
            (imageView_list[i]).setVisibility(View.INVISIBLE)
        }
    }
}