package com.yusufabd.data.tools

import io.reactivex.CompletableTransformer
import io.reactivex.ObservableTransformer
import io.reactivex.SingleTransformer
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers

/**
 * Created by yusufabd on 4/14/18.
 */
class RxTools {

    companion object {
        fun <Any> observableAsync(): ObservableTransformer<Any, Any> {
            return ObservableTransformer { observable ->
                observable
                        .subscribeOn(Schedulers.io())
                        .observeOn(AndroidSchedulers.mainThread())
            }
        }
        fun <Any> singleAsync(): SingleTransformer<Any, Any> {
            return SingleTransformer { single ->
                single
                        .subscribeOn(Schedulers.io())
                        .observeOn(AndroidSchedulers.mainThread())
            }
        }
        fun completableAsync(): CompletableTransformer {
            return CompletableTransformer { single ->
                single
                        .subscribeOn(Schedulers.io())
                        .observeOn(AndroidSchedulers.mainThread())
            }
        }
    }

}